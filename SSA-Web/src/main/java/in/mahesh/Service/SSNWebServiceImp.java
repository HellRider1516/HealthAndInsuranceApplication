package in.mahesh.Service;

import org.springframework.stereotype.Service;

import in.mahesh.Binding.SSNRequest;
import in.mahesh.Binding.SSNResponse;
@Service
public class SSNWebServiceImp implements SSAWebService {

	@Override
	public SSNResponse getCitizenInfo(SSNRequest request) {
		SSNResponse resp = new SSNResponse();
		String ssn = request.getSsn();
		resp.setSsn(ssn);
		if(ssn.startsWith("1")) {
			resp.setName("New Jersy");
		}else if(ssn.startsWith("2")) {
			resp.setName("Texas");
		}else if(ssn.startsWith("3")) {
			resp.setName("Dallas");
		}else if(ssn.startsWith("4")) {
			resp.setName("Rhode Island");
		}else if(ssn.startsWith("5")) {
			resp.setName("Kentucky");
		}else if(ssn.startsWith("6")) {
			resp.setName("Alabma");
		}else if(ssn.startsWith("7")) {
			resp.setName("Nekus");
		}else if(ssn.startsWith("8")) {
			resp.setName("romaite");
		}else if(ssn.startsWith("9")) {
			resp.setName("newStao");
		}else if(ssn.startsWith("0")) {
			resp.setName("Statoo");
		}
		
		return resp;
	}

}
