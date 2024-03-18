# Business Logic
Here is going to be placed UML diagrams that represents business requirements to our system.

Links for exploration:
- [UML Diagrams](https://miro.com/diagramming/what-is-a-uml-diagram/)
- [Sequence Diagrams](https://www.lucidchart.com/pages/uml-sequence-diagram)
- [PlanUML tool](https://medium.com/@shivansh2301/creating-various-types-of-uml-diagrams-with-plantuml-1d8f5fa46f11)


## Business Flows
1. [Put-On-Hold](./business/warehouse/Put-On-Hold.md)
2. [Create-Order](./business/order/Create-Order.md)
3. [Checkout-Shopping-Cart](./business/shopping-cart/Checkout-Shopping-Cart.md)
4. [Get-Product](./business/warehouse/Get-Product.md)


## Warehouse Service
Is responsible for
1. Managing warehouses
2. Managing inventories inside specific warehouse
3. Managing available product bases on warehouse and inventory data
4. Providing product info and product itself
5. Put-on-hold mechanism for preventing negative user experience

### Warehouse ER Diagram
![Here should be ER diagram of Warehouse database]()


## Order Service
Is responsible for
1. Managing orders and order items
2. Managing final price calculation
3. Providing Order History and Order Details
4. Notification other services with Order Creation

### Order ER Diagram
![Here should be ER diagram of Order database]()


## Shopping Cart Service
Is responsible for 
1. Add new item to shopping cart
2. Increase item amount in shopping cart
3. Clean up shopping cart fully or by item
4. Checkout shopping cart
5. Creation of shopping cart

### Shopping Cart ER Diagram
![Here should be ER diagram of Shopping Cart database]()


## Delivery Service
Is responsible for
1. Leveraging warehouse
2. Delivery status info providing

### Delivery ER Diagram
![Here should be ER diagram of Delivery database]()


## User Service
Is responsible for
1. User creation
2. Managing all actors (Customer, Delivery Manager, Merchant)
3. Providing user info
4. Managing user profile
5. Observing user interactions, e.g. which products were visited by user

### User ER Diagram
![Here should be ER diagram of User database]()


## Payment Service
Is responsible for
1. Platform currency
2. Balance management
3. TBD

### Payment ER Diagram
![Here should be ER diagram of Payment database]()
