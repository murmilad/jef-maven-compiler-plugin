package com.technology.jef.wecompiler;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import com.technology.jef.wecompiler.WECompiler;


@Mojo( name = "generate-html")
public class CompilerMojo  extends AbstractMojo {

    @Parameter( property = "generate-html.interfacePath", defaultValue = "src/main/resources/jef" )
    private String interfacePath;
    @Parameter( property = "generate-html.htmlPath", defaultValue = "src/main/webapp" )
    private String htmlPath;
    @Parameter( property = "generate-html.jsPath", defaultValue = "src/main/webapp/js" )
    private String jsPath;
    @Parameter( property = "generate-html.locale", defaultValue = "ru_RU" )
    private String locale;
    
    public void execute() throws MojoExecutionException
    {
        getLog().info( "generate-html.jefInterfacePath = " + interfacePath);
        getLog().info( "generate-html.jefHTMLPath = " + htmlPath);
        getLog().info( "generate-html.jefJsPath = " + jsPath);
        getLog().info( "generate-html.locale = " + locale);
        try  {
            WECompiler.main(new String[]{interfacePath, htmlPath, jsPath, locale});
        } catch (Exception e) {
            throw new MojoExecutionException(e.getMessage(), e);
        } 
    }
}
