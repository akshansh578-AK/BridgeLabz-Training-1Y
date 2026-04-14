Ride-Sharing Dispatch System
Scenario:
A ride-sharing app (like Ola or Uber) must manage incoming ride requests and
drivers’ availability.
Requirements:
● Use a Queue<RideRequest> for pending ride requests.
● Use a Set<Driver> to store available drivers (no duplicates).

● Use a List<Ride> to maintain completed rides.
● Use a PriorityQueue<RideRequest> to assign rides based on
proximity or urgency.

Tasks:
1. Add incoming ride requests.
2. Assign drivers from the available pool.
3. Move completed rides to the ride history list.
4. Handle high-priority requests first.