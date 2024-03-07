package com.example.Dosify.dto.RequestDTO;

import com.example.Dosify.Enum.DoseNo;
import com.example.Dosify.Enum.VaccineType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AppointmentRequestDto {

	DoseNo doseNo;

    int userId;

    int doctorId;

    VaccineType vaccineType;
    public DoseNo getDoseNo() {
		return doseNo;
	}

	public void setDoseNo(DoseNo doseNo) {
		this.doseNo = doseNo;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public VaccineType getVaccineType() {
		return vaccineType;
	}

	public void setVaccineType(VaccineType vaccineType) {
		this.vaccineType = vaccineType;
	}

}
