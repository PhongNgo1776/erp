package test.soap;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

public class JAXBExample {

    private static final String FILE_NAME = "D:/jaxb-emp.xml";

    public static void main(String[] args) {
//        Employee emp = new Employee();
//        emp.setId(1);
//        emp.setAge(25);
//        emp.setName("Phong");
//        emp.setGender("Male");
//        List<Role> roleList = new ArrayList<>();
//        Role role1 = new Role("role1");
//        Role role2 = new Role("role2");
//        roleList.add(role1);
//        roleList.add(role2);
//        emp.setRole(roleList);
//        emp.setPassword("sensitive");
//
//        jaxbObjectToXML(emp);

        Employee empFromFile = jaxbXMLToObject();
        System.out.println(empFromFile.toString());
    }


    private static Employee jaxbXMLToObject() {
        try {
        	XMLInputFactory xif = XMLInputFactory.newFactory();
            StreamSource xml = new StreamSource(FILE_NAME);
            XMLStreamReader xsr = xif.createXMLStreamReader(xml);
            xsr.nextTag();
            while(!xsr.getLocalName().equals("return")) {
                xsr.nextTag();
            }
     
            JAXBContext jc = JAXBContext.newInstance(Employee.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            JAXBElement<Employee> jb = unmarshaller.unmarshal(xsr, Employee.class);
            xsr.close();
     
            Employee employee = jb.getValue();
            System.out.println(employee);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }


    private static void jaxbObjectToXML(Employee emp) {
    	
        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Marshaller m = context.createMarshaller();
            //for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Write to System.out for debugging
            // m.marshal(emp, System.out);

            // Write to File
            m.marshal(emp, new File(FILE_NAME));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}