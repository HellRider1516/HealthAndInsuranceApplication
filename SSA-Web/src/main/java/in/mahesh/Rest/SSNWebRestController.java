package in.mahesh.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mahesh.Binding.SSNRequest;
import in.mahesh.Binding.SSNResponse;
import in.mahesh.Service.SSNWebServiceImp;

@RestController
public class SSNWebRestController {
	
	@Autowired
	private SSNWebServiceImp service;
	
	@PostMapping("/ssn")
	public ResponseEntity<SSNResponse> getDeatilsOfCitizen(@RequestBody SSNRequest req){
		SSNResponse citizenInfo = service.getCitizenInfo(req);
		return new ResponseEntity<SSNResponse>(citizenInfo, HttpStatus.OK);
		
	}
	
	

}
