package com.vvk.learn.learningspring.webservice;

import com.vvk.learn.learningspring.business.ReservationService;
import com.vvk.learn.learningspring.business.RoomReservation;
import com.vvk.learn.learningspring.data.Guest;
import com.vvk.learn.learningspring.data.Room;
import com.vvk.learn.learningspring.util.DateUtils;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WebserviceController {
    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    public WebserviceController(DateUtils dateUtils, ReservationService reservationService) {
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<RoomReservation> getReservations(@RequestParam(value = "date", required = false) String dateString, Model model){
        Date date = this.dateUtils.createDateFromDateString(dateString);
        return this.reservationService.getRoomReservationsForDate(date);
    }

    @GetMapping("/guests")
    public List<Guest> getGuests(Model model){
        return this.reservationService.getGuests();
    }

    @PostMapping("/guests")
    @ResponseStatus(HttpStatus.CREATED)
    public void addGuest(@RequestBody(required = true) Guest guest, Model model){
        this.reservationService.addGuest(guest);
    }

    @GetMapping("/rooms")
    public List<Room> getRooms(Model model){
        return this.reservationService.getRooms();
    }

}
