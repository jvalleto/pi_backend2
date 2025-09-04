package com.example.pib2.service;



import java.util.List;
import org.springframework.stereotype.Service;
import com.example.pib2.models.entity.Appointment;
import com.example.pib2.repository.AppointmentRepository;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    // Crear/guardar cita
    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    // Listar todas las citas
    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    // Buscar por ID
    public Appointment findById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    // Eliminar por ID
    public void deleteById(Long id) {
        appointmentRepository.deleteById(id);
    }
}
