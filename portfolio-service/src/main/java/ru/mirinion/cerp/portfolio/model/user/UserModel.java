package ru.mirinion.cerp.portfolio.model.user;

import jakarta.persistence.*;
import lombok.*;
import ru.mirinion.cerp.portfolio.model.certificate.CertificateModel;

import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserModel {
	@Id
	@GeneratedValue
	private long id;
	private String email;
	private String password;
	private String telegram;
	private String firstName;
	private String lastName;
	private SystemRole systemRole;
	@OneToMany(mappedBy = "user")
	private List<CertificateModel> certificates;
}
