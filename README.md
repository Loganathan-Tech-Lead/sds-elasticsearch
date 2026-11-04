# 46. Elasticsearch read model

**Category:** Data and caching  |  **Status:** Scaffold - implement the TODOs

Kafka-fed search index for CQRS.

## Sequence
```mermaid
sequenceDiagram
    participant Kafka
    participant Indexer
    participant ES
    participant Search
    Kafka->>Indexer: OrderCreated
    Indexer->>ES: PUT /orders/_doc/501
    Search->>ES: GET /orders/_search
    ES->>Search: hits
```

## Run
```bash
docker compose up -d
mvn spring-boot:run
```

## Part of
[system-design-concepts-master](../../README.md) - see the master repo for the full concept map.
