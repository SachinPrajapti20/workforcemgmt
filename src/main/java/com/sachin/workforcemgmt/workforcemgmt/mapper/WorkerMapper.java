package com.sachin.workforcemgmt.workforcemgmt.mapper;


import com.sachin.workforcemgmt.workforcemgmt.dto.WorkerRequest;
import com.sachin.workforcemgmt.workforcemgmt.dto.WorkerResponse;
import com.sachin.workforcemgmt.workforcemgmt.model.Worker;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WorkerMapper {
    Worker toWorker(WorkerRequest request);
    WorkerResponse toResponse(Worker worker);
}
