package ttts.task_time_tracking_system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Projects implements Serializable {
    private int idProjeto;
    private String name;
    private String client;

    private Freelancer freelancer;
    private float priceHour;
    private ProjectState state;
    private List<Tasks> tasks;

    public Projects(){this.tasks = new ArrayList<>();} //Construtor

    public List<Tasks> getTasks(){return tasks;} //getter das tarefas

    public void ListTasks(){
        int numTasks = 1;
        for(Tasks tk : this.tasks){
            System.out.println("Id Tarefa: " + tk.getIdTask());
            System.out.println("Data Inicio: " + tk.getTaskStartDate());
            System.out.println("Data Fim: " + tk.getTaskEndDate());
            System.out.println("Descrição: " + tk.getDescription());

        }
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

    public float getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(float priceHour) {
        this.priceHour = priceHour;
    }

    public ProjectState getState() {
        return state;
    }

    public void setState(ProjectState state) {
        this.state = state;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }
}
