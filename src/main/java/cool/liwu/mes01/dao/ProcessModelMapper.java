package cool.liwu.mes01.dao;

import cool.liwu.mes01.pojo.ProcessModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProcessModelMapper {
    List<ProcessModel> getProcessModels();

    List<ProcessModel> searchProcessModels(@Param("processName") String processName);

    int getProcessModelsCount();

    ProcessModel getProcessModelById(String id);

    int searchProcessModelsCount(@Param("processName") String processName);

    void insertProcessModel(ProcessModel processModel);

    void updateProcessModel(ProcessModel processModel);

    void deleteProcessModelById(String id);
}

