package cool.liwu.mes01.service.Impl;

import com.github.pagehelper.PageHelper;
import cool.liwu.mes01.dao.ProcessModelMapper;
import cool.liwu.mes01.pojo.ProcessModel;
import cool.liwu.mes01.service.ProcessModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessModelServiceImpl implements ProcessModelService {
    @Autowired
    private ProcessModelMapper processModelMapper;

    @Override
    public List<ProcessModel> getProcessModels(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return processModelMapper.getProcessModels();
    }

    @Override
    public ProcessModel getProcessModelById(String id) {
        return processModelMapper.getProcessModelById(id);
    }

    @Override
    public List<ProcessModel> searchProcessModels(String processName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return processModelMapper.searchProcessModels(processName);
    }

    @Override
    public void insertProcessModel(ProcessModel processModel) {
        processModelMapper.insertProcessModel(processModel);
    }

    @Override
    public void updateProcessModel(ProcessModel processModel) {
        processModelMapper.updateProcessModel(processModel);
    }

    @Override
    public void deleteProcessModelById(String id) {
        processModelMapper.deleteProcessModelById(id);
    }
}
