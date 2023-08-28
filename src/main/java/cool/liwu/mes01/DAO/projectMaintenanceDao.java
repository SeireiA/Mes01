package cool.liwu.mes01.DAO;

import cool.liwu.mes01.POJO.projectMaintenance;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface projectMaintenanceDao {

    @Select("SELECT * FROM project")
    List<projectMaintenance> getAllProjects();

    @Select("SELECT * FROM project WHERE id = #{id}")
    projectMaintenance getProjectById(@Param("id") int id);

    @Insert("INSERT INTO project(name, leader, start_date, end_date, status) " +
            "VALUES(#{name}, #{leader}, #{startDate}, #{endDate}, #{status})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void createProject(projectMaintenance project);

    @Update("UPDATE project SET name = #{name}, leader = #{leader}, " +
            "start_date = #{startDate}, end_date = #{endDate}, status = #{status} " +
            "WHERE id = #{id}")
    void updateProject(projectMaintenance project);

    @Delete("DELETE FROM project WHERE id = #{id}")
    void deleteProject(@Param("id") int id);
}
