package bigcode.repository.sourcecode.rest.controller;

import java.io.InputStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project/{projectId}/repository/{repositoryId}/content")
public class FileContentController {

	@GetMapping("/{hash}")
	public InputStream getContent(@PathVariable("projectId") String projectId,
			                      @PathVariable("repositoryId") String repositoryId,
			                      @PathVariable("hash") String contentHashcode) {
		return null;
	}
	
	@PutMapping("/{hash}")
	public void storeContent(@PathVariable("projectId") String projectId,
			                      @PathVariable("repositoryId") String repositoryId,
			                      @PathVariable("hash") String contentHashcode,
			                      @RequestBody InputStream content) {
	}
	
	@RequestMapping(value = "/{hash}", method = RequestMethod.HEAD)
	public void checkContentExists() {
		
	}
	
}
