package cool.liwu.mes01.Service.Impl;

import cool.liwu.mes01.DAO.projectMaintenanceDao;
import cool.liwu.mes01.POJO.projectMaintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class projectMaintenanceService {
    private final projectMaintenanceDao projectDao;

    @Autowired
    public projectMaintenanceService(projectMaintenanceDao projectDao) {
        this.projectDao = projectDao;
    }

    public List<projectMaintenance> getAllProjects() {
        return projectDao.getAllProjects();
    }

    public projectMaintenance getProjectById(int id) {
        return projectDao.getProjectById(id);
    }

    public void createProject(projectMaintenance project) {
        projectDao.createProject(project);
    }

    public void updateProject(projectMaintenance project) {
        projectDao.updateProject(project);
    }

    public void deleteProject(int id) {
        projectDao.deleteProject(id);
    }
}
