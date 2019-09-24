package com.technology.jef.wecompiler;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import com.technology.jef.wecompiler.WECompiler;


@Mojo( name = "jef-compiller")
public class CompilerMojo  extends AbstractMojo {

    @Parameter( property = "jef.interface-path", defaultValue = "src/main/resources/jef" )
    private String interfacePath;
    
    public void execute() throws MojoExecutionException
    {
        getLog().info( "Hello, world." );
        WECompiler.main(new String[]{interfacePath}); 
    }
}
