package ru.mirinion.cerp.portfolio.model.certificate;

import jakarta.persistence.*;
import lombok.*;
import ru.mirinion.cerp.portfolio.model.user.UserModel;

import java.util.Date;

@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CertificateModel {
	@Id
	@GeneratedValue
	private long id;
	private String publisherInnerId;
	@ManyToOne
	private UserModel user;
	private Date assignDate;
	private String description;
}
