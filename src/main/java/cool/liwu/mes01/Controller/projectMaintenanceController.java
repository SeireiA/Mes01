package cool.liwu.mes01.Controller;

import cool.liwu.mes01.POJO.projectMaintenance;
import cool.liwu.mes01.Service.Impl.projectMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

        //数据库表设计：
        //CREATE TABLE project (
        //        id INT AUTO_INCREMENT PRIMARY KEY,
        //        name VARCHAR(100) NOT NULL,
        //        leader VARCHAR(50) NOT NULL,
        //        start_date DATE NOT NULL,
        //        end_date DATE NOT NULL,
        //        status VARCHAR(10) NOT NULL
        //        );


@RestController
@RequestMapping("/projects")
public class projectMaintenanceController {
    private final projectMaintenanceService projectService;

    @Autowired
    public projectMaintenanceController(projectMaintenanceService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<projectMaintenance> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/{id}")
    public projectMaintenance getProjectById(@PathVariable int id) {
        return projectService.getProjectById(id);
    }

    @PostMapping
    public void createProject(@RequestBody projectMaintenance project) {
        projectService.createProject(project);
    }

    @PutMapping("/{id}")
    public void updateProject(@PathVariable int id, @RequestBody projectMaintenance project) {
        project.setId(id);
        projectService.updateProject(project);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable int id) {
        projectService.deleteProject(id);
    }
}
