package com.sachin.workforcemgmt.workforcemgmt.controller;


import com.sachin.workforcemgmt.workforcemgmt.dto.WorkerRequest;
import com.sachin.workforcemgmt.workforcemgmt.dto.WorkerResponse;
import com.sachin.workforcemgmt.workforcemgmt.mapper.WorkerMapper;
import com.sachin.workforcemgmt.workforcemgmt.model.Worker;
import com.sachin.workforcemgmt.workforcemgmt.repository.WorkerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    private final WorkerRepository workerRepository;
    private final WorkerMapper workerMapper;

    public WorkerController(WorkerRepository repo, WorkerMapper mapper) {
        this.workerRepository = repo;
        this.workerMapper = mapper;
    }

    @PostMapping
    public ResponseEntity<WorkerResponse> createWorker(@RequestBody WorkerRequest request) {
        Worker worker = workerMapper.toWorker(request);
        Worker saved = workerRepository.save(worker);
        return ResponseEntity.ok(workerMapper.toResponse(saved));
    }

    @GetMapping
    public ResponseEntity<List<WorkerResponse>> getAll() {
        List<Worker> workers = workerRepository.findAll();
        return ResponseEntity.ok(
                workers.stream().map(workerMapper::toResponse).collect(Collectors.toList())
        );
    }

    @GetMapping("/role/{role}")
    public ResponseEntity<List<WorkerResponse>> getByRole(@PathVariable String role) {
        List<Worker> workers = workerRepository.findByRole(role);
        return ResponseEntity.ok(
                workers.stream().map(workerMapper::toResponse).collect(Collectors.toList())
        );
    }
}
