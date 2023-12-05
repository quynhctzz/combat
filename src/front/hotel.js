const roomsData = [
    { id: 1, number: '101', type: 'Single' },
    { id: 2, number: '102', type: 'Double' },
    // ... other rooms
];

const customersData = [
    { id: 1, firstName: 'John', lastName: 'Doe', email: 'john@example.com' },
    { id: 2, firstName: 'Jane', lastName: 'Smith', email: 'jane@example.com' },
    // ... other customers
];

const staffData = [
    { id: 1, name: 'Alice', position: 'Receptionist' },
    { id: 2, name: 'Bob', position: 'Housekeeping' },
    // ... other staff
];

const bookingsData = [
    { id: 1, customerId: 1, roomId: 1, checkInDate: '2023-01-01', checkOutDate: '2023-01-07' },
    { id: 2, customerId: 2, roomId: 2, checkInDate: '2023-02-01', checkOutDate: '2023-02-07' },
    // ... other bookings
];

// Function to render rooms
function renderRooms() {
    const roomsContainer = document.getElementById('app');
    roomsContainer.innerHTML = '<h2>Rooms</h2>';

    roomsData.forEach(room => {
        const roomElement = document.createElement('div');
        roomElement.innerHTML = `<p>${room.number} - ${room.type}</p>`;
        roomsContainer.appendChild(roomElement);
    });
}

// Function to render customers
function renderCustomers() {
    const customersContainer = document.getElementById('app');
    customersContainer.innerHTML = '<h2>Customers</h2>';

    customersData.forEach(customer => {
        const customerElement = document.createElement('div');
        customerElement.innerHTML = `<p>${customer.firstName} ${customer.lastName} - ${customer.email}</p>`;
        customersContainer.appendChild(customerElement);
    });
}

// Function to render staff
function renderStaff() {
    const staffContainer = document.getElementById('app');
    staffContainer.innerHTML = '<h2>Staff</h2>';

    staffData.forEach(staff => {
        const staffElement = document.createElement('div');
        staffElement.innerHTML = `<p>${staff.name} - ${staff.position}</p>`;
        staffContainer.appendChild(staffElement);
    });
}

// Function to render bookings
function renderBookings() {
    const bookingsContainer = document.getElementById('app');
    bookingsContainer.innerHTML = '<h2>Bookings</h2>';

    bookingsData.forEach(booking => {
        const bookingElement = document.createElement('div');
        bookingElement.innerHTML = `<p>Booking #${booking.id} - Check-in: ${booking.checkInDate}, Check-out: ${booking.checkOutDate}</p>`;
        bookingsContainer.appendChild(bookingElement);
    });
}

// Example: Render rooms by default
renderRooms();