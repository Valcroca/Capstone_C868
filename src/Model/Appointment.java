package Model;

public class Appointment {
    private int appointmentId, customerId, userId;
    private String title, description, location, contact, type, url, start, end;

    public Appointment() {}

    public Appointment(int appointmentId, int customerId, int userId, String title, String description, String location, String contact, String type, String url, String start, String end) {
        this.appointmentId = appointmentId;
        this.customerId = customerId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.location = location;
        this.contact = contact;
        this.type = type;
        this.url = url;
        this.start = start;
        this.end = end;
    }

    public Appointment(int appointmentId, int customerId, String title, String type, String start, String end) {
        this.appointmentId = appointmentId;
        this.customerId = customerId;
        this.title = title;
        this.type = type;
        this.start = start;
        this.end = end;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        if (customerId > 0) {
            this.customerId = customerId;
        } else
           throw new IllegalArgumentException("customerID must be bigger than 0") ;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        if (userId > 0)
            this.userId = userId;
        else
            throw new IllegalArgumentException("userID must be bigger than 0") ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.isEmpty())
            this.title = title;
        else
            throw new IllegalArgumentException("title cannot be empty");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!type.isEmpty())
            this.type = type;
        else
            throw new IllegalArgumentException("type cannot be empty");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        if (!start.isEmpty())
            this.start = start;
        else
            throw new IllegalArgumentException("start cannot be empty");
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        if (!end.isEmpty())
            this.end = end;
        else
            throw new IllegalArgumentException("end cannot be empty");
    }
}
