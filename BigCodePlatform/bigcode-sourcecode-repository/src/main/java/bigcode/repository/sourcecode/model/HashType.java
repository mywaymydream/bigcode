package bigcode.repository.sourcecode.model;

import java.util.regex.Pattern;

public enum HashType {
                      
                      SHA256(Pattern.compile(
                                             "[A-Fa-f0-9]{64}")),
                      SHA512(Pattern.compile(
                                             "[A-Fa-f0-9]{128}"));
                      
    private String algorithmName;
    private Pattern pattern;
    
    private HashType(Pattern pattern) {
        this.algorithmName = this.name().toLowerCase();
        this.pattern = pattern;
    }
    
    public String getAlgorithmName() {
        return this.algorithmName;
    }
    
    public boolean validate(String value) {
        if (value == null) {
            return false;
        }
        return this.pattern.matcher(
                                    value)
                           .matches();
    }
    
}
