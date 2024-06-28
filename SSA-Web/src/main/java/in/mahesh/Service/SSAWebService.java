package in.mahesh.Service;

import in.mahesh.Binding.SSNRequest;
import in.mahesh.Binding.SSNResponse;

public interface SSAWebService {
	
	public SSNResponse getCitizenInfo(SSNRequest request);

}
