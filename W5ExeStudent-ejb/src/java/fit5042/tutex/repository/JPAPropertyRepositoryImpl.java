package fit5042.tutex.repository;

import fit5042.tutex.repository.entities.ContactPerson;
import fit5042.tutex.repository.entities.Property;
import java.util.List;
import java.util.Set;
import javax.ejb.Stateless;

/**
 *
 * TODO Implement this. For this Week, you will need to use the Container managed
 * method instead of the Application Managed method done in earlier weeks.
 * 
 * Please refer to provided materials to complete this class.
 * @author Eddie Leung
 */
@Stateless
public class JPAPropertyRepositoryImpl implements PropertyRepository {

    @Override
    public void addProperty(Property property) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Property searchPropertyById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Property> getAllProperties() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ContactPerson> getAllContactPeople() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeProperty(int propertyId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editProperty(Property property) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Property> searchPropertyByBudget(double budget) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Property> searchPropertyByContactPerson(ContactPerson contactPerson) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}
