package bigcode.repository.sourcecode.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bigcode.repository.sourcecode.rest.dto.RepositoryDto;

@RestController
public class RepositoryController {
    
    @GetMapping("/project/{projectId}/repository/{id}")
    public RepositoryDto getById(@PathVariable("projectId") String projectId,
                                 @PathVariable("id") String repositoryId) {
        return new RepositoryDto();
    }
}
