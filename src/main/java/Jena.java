import org.apache.jena.rdf.model.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class Jena {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:/Users/Jakovcheski/Desktop/instance_types_en.ttl";

        Model model = ModelFactory.createDefaultModel();
        model.read(filePath);

        // list the statements in the Model
//        StmtIterator iter = model.listStatements();
//
//// print out the predicate, subject and object of each statement
//        while (iter.hasNext()) {
//            Statement stmt = iter.nextStatement();  // get next statement
//            Resource subject = stmt.getSubject();     // get the subject
//            Property predicate = stmt.getPredicate();   // get the predicate
//            RDFNode object = stmt.getObject();      // get the object
//
//            System.err.println("Subject " + subject.toString());
//            System.err.println("Predicate " + predicate.toString());
//            System.err.println("Object " + object.toString());
////            System.out.print(subject.toString());
////            System.out.print(" " + predicate.toString() + " ");
////            if (object instanceof Resource) {
////                System.out.print(object.toString());
////            } else {
////                // object is a literal
////                System.out.print(" \"" + object.toString() + "\"");
////            }
//
//        }
    }
}
