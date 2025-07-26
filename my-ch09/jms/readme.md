```bash
curl -X POST http://localhost:8080/api/orders \
  -H "Content-Type: application/json" \
  -d '{"orderId": "12345", "customerName": "John Doe", "items": ["item1", "item2"]}'
```
