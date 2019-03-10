package bigcode.repository.sourcecode.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bigcode.repository.sourcecode.rest.dto.ProjectDto;

@RestController
@RequestMapping("/project")
public class ProjectController {


	@GetMapping("/{id}")
	public ProjectDto getById(@PathVariable("id") String id) {
		return new ProjectDto();
	}
	
	
}
