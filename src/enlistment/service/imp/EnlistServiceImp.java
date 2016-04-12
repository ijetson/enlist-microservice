package enlistment.service.imp;

import enlistment.service.EnlistmentService;

public class EnlistServiceImp implements EnlistmentService {

	@Override
	public boolean addSubject(Integer studentId, String subjectCode) {
		if(studentId!=null && subjectCode!=null){
			//todo add to db 
		}
		
		
		return false;
	}

}
