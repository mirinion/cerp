package ru.mirinion.cerp.portfolio.model.publisher;

import jakarta.persistence.*;
import lombok.*;
import ru.mirinion.cerp.portfolio.model.activity.ActivityModel;

import java.util.List;

@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "activities")
@EqualsAndHashCode(exclude = "activities")
public class PublisherModel {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String description;
	@OneToMany(mappedBy = "publisher")
	private List<ActivityModel> activities;
}
