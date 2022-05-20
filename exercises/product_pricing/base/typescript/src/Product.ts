export class Product {
  constructor(private price: number) {}

  total(): number {
    const vat = 0.21;
    return this.price * (1 + vat);
  }
}
