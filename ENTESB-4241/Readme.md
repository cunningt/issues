Introduction
============

Building the quickstart
======================

To build the quickstart :

```
mvn clean install
```


Running the quickstart
======================


Fuse
----------
1. Start the Fuse server :

${FUSE_HOME}/bin/fuse

2. Install the feature for the rest-binding quickstart :

JBossFuse:karaf@root> features:install switchyard-quickstart-rest-binding

3. osgi:list, then find the bundle id of "Switchyard Quickstart: rest-binding"

[ 321] [Active     ] [            ] [       ] [   80] wrap_mvn_org.jboss.resteasy_resteasy-jaxb-provider_2.3.10.Final (0)
[ 322] [Active     ] [Created     ] [       ] [   80] SwitchYard: RESTEasy Component (2.0.1.redhat-621069)
[ 323] [Active  ] [            ] [       ] [   80] SwitchYard Quickstart: rest-binding (2.0.1.redhat-621069)

In this example, the ID is 323, but it may differ in your case.

osgi:stop <bundle-id>

osgi:install mvn:org.switchyard.quickstarts/switchyard-rest-binding-wsrs/2.0.1-redhat-SNAPSHOT
(should tell you the bundle-id after installation)

osgi:start <bundle-id> (ex: 324) 


3. Open a console windows and type  

mvn exec:java -Pkaraf -Dexec.args="new"

4. log:display - you should see the following output 

2015-10-21 15:26:50,950 | WARN  | qtp1353558557-71 | ServletHandler                   | 97 - org.eclipse.jetty.aggregate.jetty-all-server - 8.1.17.v20150415 | /rest-binding/inventory
org.jboss.resteasy.spi.UnhandledException: java.lang.AbstractMethodError: javax.ws.rs.core.Response.getStatusInfo()Ljavax/ws/rs/core/Response$StatusType;


## Further Reading

1. [RESTEasy Binding Documentation](https://docs.jboss.org/author/display/SWITCHYARD/RESTEasy)
