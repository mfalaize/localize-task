Localize-Task
=============

###Description

This project is a Ant task designed to translate files such as HTML files directly from the build process. This task generate as many directories as you have properties or java localization files in your project.

For example, in this project there is two properties files for both French and English languages and one HTML file (test.html). When the unit test runs during the build, the task generate en/ and fr/ directories with translated test.html file inside.

###Why this project ?

When you design an international HTML 5 project without a server language such as PHP or ASP (for static website or client-server project architecture with HTML-javascript), you always ask yourself about translation. May I use javascript and AJAX to get the right word from a remote server or do I have to use a server language ?

The answer is this project. There is two advantages to use this :
* The internationalization is as easy to maintain than a project using a server language.
* You host as many sites as you support languages. It is web compliant and web crawlers can easily index your web pages because there is no dynamic content.

###How to configure your build.xml ?

Here is an example of a localize target :
<pre>
&lt;target name="localize"
            description="Taskdef the LocalizeTask"&gt;
        &lt;taskdef name="localize"
                 classname="com.mfalaize.ant.LocalizeTask"
                 classpath="target"/&gt;
        &lt;localize projectDirectory="." targetDirectory="target" includes="**/*.html" resourceBundleBaseName="messages" encoding="UTF-8" translateDirectory="src/test/resources/"/&gt;
&lt;/target&gt;
</pre>
You can use standard Ant includes and excludes attributes to select files you want to proceed. All specific attribute of the localize task are notified in this example but every attribute are optionnal and have a default value :
* projectDirectory default is the working directory of Ant.
* targetDirectory default is the same as projectDirectory. The target directory is the directory in which the locales folders will be generated.
* resourceBundleBaseName default is messages (in this example the attribute is useless by the way).
* encoding default is UTF-8.
* translateDirectory default is the same as projectDirectory. It represents the directory in which scan all the files to translate.

###How to translate text in your files ?

You have just to put the pattern <code>$${key}</code> in your file. For example in a HTML code :
<pre>
&lt;h1&gt;$${main.title}&lt;/h1&gt;
</pre>
Note that you can put spaces between key and braces.