package seedu.duke.helper.command;

import seedu.duke.assets.List;
import seedu.duke.exception.DuplicateEntryException;
import seedu.duke.status.Status;

/*
 * Class that extends Abstract Command Class.
 */
public class AddDoctorCommand extends Command {

    /*
     * Constructor method that calls constructor of super class
     * @ param parameterArray an array of Strings - additional parameters given by user
     */
    public AddDoctorCommand(String[] parameterArray) {
        super(parameterArray);
    }

    /*
     * Method that takes in a DoctorList that needs to be acted on.
     * Uses parameterArray as inputs to add a new Doctor to the List.
     * @ param list a List object - should be an instance of DoctorList
     * @ return Status.ADD_DOCTOR_SUCCESS if changes made to list was successful
     * @ throws DuplicateEntryException if similar entry already exist.
     */
    public Status execute(List doctorList) throws DuplicateEntryException {
        doctorList.add(parameterArray);
        return Status.ADD_DOCTOR_SUCCESS;
    }

}
