package skyglass.composer.messaging.kafka.spring.basic.consumer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import skyglass.composer.messaging.kafka.basic.consumer.BackPressureConfig;

@ConfigurationProperties("eventuate.local.kafka.consumer")
public class EventuateKafkaConsumerSpringConfigurationProperties {
	Map<String, String> properties = new HashMap<>();

	private BackPressureConfig backPressure = new BackPressureConfig();

	private long pollTimeout = 100;

	public BackPressureConfig getBackPressure() {
		return backPressure;
	}

	public void setBackPressure(BackPressureConfig backPressure) {
		this.backPressure = backPressure;
	}

	public long getPollTimeout() {
		return pollTimeout;
	}

	public void setPollTimeout(long pollTimeout) {
		this.pollTimeout = pollTimeout;
	}

	public Map<String, String> getProperties() {
		return properties;
	}
}
