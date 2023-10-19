package task.example.demo.model;

import java.util.Objects;

public class Task {
        private Long id;
        private String description;

        // Default constructor
        public Task() {
        }

        // Parameterized constructor
        public Task(Long id, String description) {
                this.id = id;
                this.description = description;
        }

        // Getters and setters
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Task task = (Task) o;
                return id.equals(task.id) &&
                        description.equals(task.description);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, description);
        }

        @Override
        public String toString() {
                return "Task{" +
                        "id=" + id +
                        ", description='" + description + '\'' +
                        '}';
        }
}

