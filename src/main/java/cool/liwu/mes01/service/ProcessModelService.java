package cool.liwu.mes01.service;

import cool.liwu.mes01.pojo.ProcessModel;

import java.util.List;

public interface ProcessModelService {
    List<ProcessModel> getProcessModels(int pageNum, int pageSize);

    ProcessModel getProcessModelById(String id);

    List<ProcessModel> searchProcessModels(String processName, int pageNum, int pageSize);

    void insertProcessModel(ProcessModel processModel);

    void updateProcessModel(ProcessModel processModel);

    void deleteProcessModelById(String id);
}
