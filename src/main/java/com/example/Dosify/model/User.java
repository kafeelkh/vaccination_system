package com.example.Dosify.model;

import com.example.Dosify.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="user")
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;


	@Column(name="name")
    String name;

    @Column(name="age")
    int age;

    @Column(name = "email_id",unique = true,nullable = false)
    String emailId;

    @Column(name="mob_no",unique = true,nullable = false)
    String mobNo;

    @Column(name="gender")
    @Enumerated(EnumType.STRING)
    Gender gender;

    @Column(name="is_dose1_taken")
    boolean isDose1Taken;

    @Column(name="is_dose2_taken")
    boolean isDose2Taken;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Appointment> appointments = new ArrayList<>();

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    Dose1 dose1;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    Dose2 dose2;
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isDose1Taken() {
		return isDose1Taken;
	}

	public void setDose1Taken(boolean isDose1Taken) {
		this.isDose1Taken = isDose1Taken;
	}

	public boolean isDose2Taken() {
		return isDose2Taken;
	}

	public void setDose2Taken(boolean isDose2Taken) {
		this.isDose2Taken = isDose2Taken;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public Dose1 getDose1() {
		return dose1;
	}

	public void setDose1(Dose1 dose1) {
		this.dose1 = dose1;
	}

	public Dose2 getDose2() {
		return dose2;
	}

	public void setDose2(Dose2 dose2) {
		this.dose2 = dose2;
	}

}
