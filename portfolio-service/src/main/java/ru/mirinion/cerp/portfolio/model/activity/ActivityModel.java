package ru.mirinion.cerp.portfolio.model.activity;

import jakarta.persistence.*;
import lombok.*;
import ru.mirinion.cerp.portfolio.model.publisher.PublisherModel;

@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ActivityModel {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private ActivityType type;
	private Sphere sphere;
	@ManyToOne
	private PublisherModel publisher;
	private String description;
}
