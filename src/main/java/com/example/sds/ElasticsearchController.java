package com.example.sds;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/** Entry point for the "Elasticsearch read model" demo. Replace with the real implementation (see TODO.md). */
@RestController
public class ElasticsearchController {
    @GetMapping("/demo/elasticsearch")
    public Map<String, String> demo() {
        return Map.of("concept", "Elasticsearch read model", "status", "scaffold - implement me");
    }
}
