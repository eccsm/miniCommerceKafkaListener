package tr.nttdata.poc.minicommerce.kafkalistener.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tr.nttdata.poc.minicommerce.kafkalistener.model.KafkaLog;

public interface LogRepository extends MongoRepository<KafkaLog, String> {
}
