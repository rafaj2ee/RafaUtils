/*---------------------------------------------------------------------------*\
|
| Copyright (c) 2011 ORGA Systems enabling services GmbH. All rights reserved.
|
| ORGA Systems enabling services GmbH makes no representations or warranties
| about the suitability of the software, either express or implied, including
| but not limited to the implied warranties of merchantability, fitness
| for a particular purpose, or non-infringement. 
| ORGA Systems enabling services GmbH shall not be liable for any damage 
| suffered by licensee as a result of using, modifying or distributing this 
| software or its derivates.
|
| This copyright notice must appear in all copies of this software.
|
|------------------------------------------------------------------------------
|
|       Project  : rafaj2eeUtils
|
|       Class    : PortIncrement
|
|       Package  : br.com.rafaj2ee.util
|
|       Modified : $Date$
|
|       Version  : $Revision$
|
\*---------------------------------------------------------------------------*/

package br.com.rafaj2ee.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class PortIncrement {
  public static final String CONF = "/conf";

  public static final String DEPLOY = "/defaultdeploy/ejb3.deployer/META-INF/";

  public static final String PORT_BINDINGS = CONF + "/port-bindings.xml";

  public static final String JBOSS_SERVICE = CONF + "/jboss-service.xml";

  public static final String JBOSS_SERVICE2 = DEPLOY + "/jboss-service.xml";

  public static final List confs = new ArrayList();

  public static final List directories = new ArrayList();

  public static final String NAME_PORT = "ort\">";

  public static final String NAME_PORT_CLOSE = "<";

  public static final String PORT = "port=\"";

  public static final String PORT_CLOSE = "\"";
  static {
    confs.add(PORT_BINDINGS);
    confs.add(JBOSS_SERVICE);
    confs.add("/defaultdeploy/http-invoker.sar/invoker.war/WEB-INF/jboss-web.xml");
    confs.add("/defaultdeploy/http-invoker.sar/invoker.war/WEB-INF/web.xml");
    confs.add("/defaultdeploy/http-invoker.sar/META-INF/jboss-service.xml");
    confs.add("/defaultdeploy/uuid-key-generator.sar/META-INF/jboss-service.xml");
    confs.add("/defaultdeploy/jsr88-service.xml");
    confs.add("/defaultdeploy/jbossjca-service.xml");
    confs.add("/defaultdeploy/jmx-invoker-service.xml");
    confs.add("/defaultdeploy/jboss-aop-jdk50.deployer/META-INF/jboss-service.xml");
    confs.add("/defaultdeploy/jboss-aop-jdk50.deployer/base-aop.xml");
    confs.add("/defaultdeploy/client-deployer-service.xml");
    confs.add("/defaultdeploy/ejb3-interceptors-aop.xml");
    confs.add("/defaultdeploy/properties-service.xml");
    confs.add("/defaultdeploy/monitoring-service.xml");
    confs.add("/defaultdeploy/jboss-web.deployer/server.xml");
    confs.add("/defaultdeploy/jboss-web.deployer/context.xml");
    confs.add("/defaultdeploy/jboss-web.deployer/META-INF/webserver-xmbean.xml");
    confs.add("/defaultdeploy/jboss-web.deployer/META-INF/jboss-service.xml");
    confs.add("/defaultdeploy/jboss-web.deployer/ROOT.war/WEB-INF/web.xml");
    confs.add("/defaultdeploy/jboss-web.deployer/conf/web.xml");
    confs.add("/defaultdeploy/jbossws.sar/META-INF/standard-jaxws-client-config.xml");
    confs.add("/defaultdeploy/jbossws.sar/META-INF/jboss-service.xml");
    confs.add("/defaultdeploy/jbossws.sar/META-INF/standard-jaxws-endpoint-config.xml");
    confs.add("/defaultdeploy/jbossws.sar/META-INF/standard-jaxrpc-endpoint-config.xml");
    confs.add("/defaultdeploy/jbossws.sar/META-INF/standard-jaxrpc-client-config.xml");
    confs.add("/defaultdeploy/jbossws.sar/jbossws.beans/META-INF/jboss-beans.xml");
    confs.add("/defaultdeploy/jbossws.sar/jbossws-context.war/WEB-INF/jboss-web.xml");
    confs.add("/defaultdeploy/jbossws.sar/jbossws-context.war/WEB-INF/web.xml");
    confs.add("/defaultdeploy/scheduler-service.xml");
    confs.add("/defaultdeploy/sqlexception-service.xml");
    confs.add("/defaultdeploy/schedule-manager-service.xml");
    confs.add("/defaultdeploy/cache-invalidation-service.xml");
    confs.add("/defaultdeploy/snmp-adaptor.sar/attributes.xml");
    confs.add("/defaultdeploy/snmp-adaptor.sar/META-INF/jboss-service.xml");
    confs.add("/defaultdeploy/snmp-adaptor.sar/managers.xml");
    confs.add("/defaultdeploy/snmp-adaptor.sar/notifications.xml");
    confs.add("/defaultdeploy/jboss-bean.deployer/META-INF/jboss-service.xml");
    confs.add("/defaultdeploy/bsh-deployer.xml");
    confs.add("/defaultdeploy/hsqldb-ds.xml");
    confs.add("/defaultdeploy/ear-deployer.xml");
    confs.add("/defaultdeploy/ejb-deployer.xml");
    confs.add("/defaultdeploy/ejb3.deployer/META-INF/jboss-service.xml");
    confs.add("/defaultdeploy/jmx-console.war/WEB-INF/jboss-web.xml");
    confs.add("/defaultdeploy/jmx-console.war/WEB-INF/web.xml");
    confs.add("/conf/xmdesc/TransactionManagerService-xmbean.xml");
    confs.add("/conf/xmdesc/Log4jService-xmbean.xml");
    confs.add("/conf/xmdesc/NamingService-xmbean.xml");
    confs.add("/conf/xmdesc/org.jboss.deployment.JARDeployer-xmbean.xml");
    confs.add("/conf/xmdesc/JNDIView-xmbean.xml");
    confs.add("/conf/xmdesc/AttributePersistenceService-xmbean.xml");
    confs.add("/conf/xmdesc/NamingBean-xmbean.xml");
    confs.add("/conf/xmdesc/org.jboss.deployment.MainDeployer-xmbean.xml");
    confs.add("/conf/xmdesc/ClientUserTransaction-xmbean.xml");
    confs.add("/conf/xmdesc/org.jboss.deployment.SARDeployer-xmbean.xml");
    confs.add("/conf/standardjbosscmp-jdbc.xml");
    confs.add("/conf/port-bindings.xml");
    confs.add("/conf/jboss-minimal.xml");
    confs.add("/conf/jbossjta-properties.xml");
    confs.add("/conf/login-config.xml");
    confs.add("/conf/standardjboss.xml");
    confs.add("/conf/jboss-service.xml");
    confs.add("/conf/jboss-log4j.xml");
    confs.add("/conf/vvs_config.xml");
    confs.add("/clusterdeploy/hasingleton-service.xml");
    confs.add("/clusterdeploy/cluster-service.xml");
    confs.add("/clusterdeploy/deploy.last/farm-service.xml");
    confs.add("/appfarm/oracle-ds.xml");
    confs.add("/appfarm/oracle-jdbc-ds.xml");
    confs.add("/appfarm/oracle-slave-ds.xml");
    confs.add("/orgadata/cnf/ussd-kit-config.xml");
    confs.add("/orgadata/cnf/validation.xml");
    confs.add("/orgadata/cnf/scheduler-services-config.xml");
    confs.add("/orgadata/cnf/billing-connector-config.xml");
    confs.add("/orgadata/cnf/auditCodeMapping.xml");
    confs.add("/orgadata/cnf/subscriber-profile-retriever-config.xml");
    confs.add("/orgadata/cnf/notification-connector-config.xml");
    confs.add("/orgadata/cnf/distributor-profile-retriever-config.xml");
    // confs.add(JBOSS_SERVICE2);
    directories.add(CONF);
    directories.add(DEPLOY);
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // System.out.println("Teste"+pathFrom);
    int increment = 1;
    try {
      if (args.length > 1) {
        increment = Integer.parseInt(args[1]);
      }
      String pathFrom = args[0];
      String pathTo = pathFrom;
      if (args.length > 2) {
        pathTo = args[2];
      }
      TreeMap portsTree = new TreeMap();
      String portasManuais[] = new String[]{"8083","1099","1200","4445","4544","4447","4444","1100","3528","19001","1162","1161","8093","8080","8193","8180","1801","1300","1901","3728","19201","1901","1399","8383","4744","4745","1400","3828","19301","1462","1461","8393","8380","8283","8280","1361","1362","4644","4645","8283","3628","1261","1262"};
      for(int i = 0; i<portasManuais.length; i++) {
       
        portsTree.put(portasManuais[i], new Integer(new Integer(portasManuais[i])+increment).toString());
      }
      for (int i1 = 0; i1 < confs.size(); i1++) {
        String arquivo = confs.get(i1).toString();
        File originalFileTest = new File(pathFrom + arquivo);
        if(originalFileTest.canRead()) {
          String originalFile = FileUtils.readFileAsString(pathFrom + arquivo);
          String openSplit = PORT;
          String closeSplit = PORT_CLOSE;
          if (originalFile.indexOf(NAME_PORT) != -1) {
            openSplit = NAME_PORT;
            closeSplit = NAME_PORT_CLOSE;
          }
          String[] originalSplited = originalFile.split(openSplit);
          /*
          if(arquivo.indexOf("jboss-service.xml")!=-1) {
            portsTree.put("4446",  new Integer(new Integer("4446") + increment).toString());
          }
          */
          for (int i = 0; i < originalSplited.length; i++) {
            String port = originalSplited[i].split(closeSplit)[0];
            try {
              Integer portIncremented = new Integer(port) + increment;
              // portBindings.replaceAll(port, portIncremented);
              portsTree.put(port, portIncremented.toString());
              // System.out.println(ports[i].split("\"")[0]);
            }
            catch (Exception e) {
            }
          }
          if (portsTree.size() > 0) {
            if(portsTree.containsKey("1.0")) {
              portsTree.remove("1.0");
            }
            if(portsTree.containsKey("0")) {
              portsTree.remove("0");
            }
            Set keys = portsTree.keySet();
            Collection values = portsTree.values();
            for(Iterator i = keys.iterator() ; i.hasNext();) {
              Object id = i.next();
              if(portsTree.containsValue(i)) {
                System.out.println("Porta existente como valor " + id + " para arquivo "+arquivo);
              }
            }
            String result = StringUtil.replaceAll(new StringBuffer(originalFile),
                                                  portsTree,
                                                  null,
                                                  null).toString();
            File directory = new File(pathTo + confs.get(i1)
                                                    .toString()
                                                    .substring(0,
                                                               confs.get(i1)
                                                                    .toString()
                                                                    .lastIndexOf("/")));
            if (!directory.canRead()) {
              directory.mkdirs();
            }
            File outFile = new File(pathTo + arquivo);
            if (!outFile.canWrite()) {
              outFile.createNewFile();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            writer.write(originalFile);
            writer.flush();
            writer.close();
            File outFileReplace = new File(pathFrom + arquivo);
            BufferedWriter writerReplace = new BufferedWriter(new FileWriter(outFileReplace));
            writerReplace.write(result);
            writerReplace.flush();
            writerReplace.close();
            System.out.println("Arquivo alterado: " + outFile.getPath());
          }
         }
      }
      System.out.println("processo finalizado Listar portas trocadas");      
        for(Iterator i = portsTree.keySet().iterator(); i.hasNext();) {
          Object key = i.next();
          System.out.println("Porta Original "+ key + " Porta Incrmentada " + portsTree.get(key));
        }
      System.out.println("processo finalizado");
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

}
