package amrib.designPattern.adapter;

import java.util.Date;

public class StudentAdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adapter adapter = new Adapter();
		StudentEntity entity = new StudentEntity("Moha", "AMIR", new Date(), false);
		StudentDTO dto = adapter.adaptEntityToDto(entity);
		System.out.println(dto);
	}

}
