package com.sachin.workforcemgmt.workforcemgmt.repository;


import com.sachin.workforcemgmt.workforcemgmt.model.Worker;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class WorkerRepository {
    private final Map<Long, Worker> workerMap = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    public Worker save(Worker worker) {
        Long id = idGenerator.incrementAndGet();
        worker.setId(id);
        workerMap.put(id, worker);
        return worker;
    }

    public List<Worker> findAll() {
        return new ArrayList<>(workerMap.values());
    }

    public List<Worker> findByRole(String role) {
        return workerMap.values().stream()
                .filter(worker -> worker.getRole().equalsIgnoreCase(role))
                .collect(Collectors.toList());
    }
}
