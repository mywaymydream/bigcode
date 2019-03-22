package bigcode.repository.sourcecode.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bigcode.repository.sourcecode.rest.dto.FileDto;

@RestController
@RequestMapping("/project/{projectId}/repository/{repositoryId}/snapshot/{snapshotId}/file")
public class FileController {
    
    @GetMapping("/{id}")
    public FileDto getFile(@PathVariable("projectId") String projectId,
                           @PathVariable("repositoryId") String repositoryId,
                           @PathVariable("snapshotId") String snapshotId,
                           @PathVariable("id") String fileId) {
        return new FileDto();
    }
    
}
