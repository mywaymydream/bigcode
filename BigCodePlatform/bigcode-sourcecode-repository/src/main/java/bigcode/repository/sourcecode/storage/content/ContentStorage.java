package bigcode.repository.sourcecode.storage.content;

import java.io.InputStream;

import bigcode.repository.sourcecode.model.ContentHash;

public interface ContentStorage {
    
    void save(ContentHash hash, InputStream input);
    
}
