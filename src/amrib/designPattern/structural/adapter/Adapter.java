package amrib.designPattern.structural.adapter;

public class Adapter {

	public StudentDTO adaptEntityToDto(StudentEntity entity) {
		return new StudentDTO(entity.getFirstname(), entity.getLastname());
	}

}
