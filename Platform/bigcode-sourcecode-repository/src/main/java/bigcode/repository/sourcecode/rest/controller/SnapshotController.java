package bigcode.repository.sourcecode.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bigcode.repository.sourcecode.rest.dto.FilesListDto;
import bigcode.repository.sourcecode.rest.dto.NewSnapshotDto;
import bigcode.repository.sourcecode.rest.dto.SnapshotDto;
import bigcode.repository.sourcecode.rest.dto.SnapshotMissedContentDto;

@RestController
@RequestMapping("/project/{projectId}/repository/{repositoryId}/snapshot")
public class SnapshotController {

	@GetMapping("/{id}")
	public SnapshotDto getById(@PathVariable("projectId") String projectId,
			                   @PathVariable("repositoryId") String repositoryId,
			                   @PathVariable("id") String id) {
		return new SnapshotDto();
	}
	
	@PutMapping("/{snapshotId}")
	public SnapshotDto createSnapshotWithCustomId(@PathVariable("projectId") String projectId,
                                                  @PathVariable("repositoryId") String repositoryId,
                                                  @PathVariable("snapshotId") String snapshotId,
                                                  @RequestBody NewSnapshotDto newSnapshot) {
		return new SnapshotDto();
	}
	
	/**
	 * The client upload computed snapshot. This information could be computed during project building.
	 * 
	 * @param projectId
	 * @param repositoryId
	 * @param newSnapshot
	 * @return
	 */
	@PostMapping
	public SnapshotDto newSnapshot(@PathVariable("projectId") String projectId,
                                   @PathVariable("repositoryId") String repositoryId,
                                   @RequestBody NewSnapshotDto newSnapshot) {
		return new SnapshotDto();
	}
	
	/**
	 * Client could request the list of missed content hashes. 
	 * @return
	 */
	@GetMapping("/{snapshotId}")
	public SnapshotMissedContentDto missedContent(@PathVariable("projectId") String projectId,
                                                  @PathVariable("repositoryId") String repositoryId,
                                                  @PathVariable("snapshotId") String snapshotId) {
		return new SnapshotMissedContentDto();
	}
	
}
