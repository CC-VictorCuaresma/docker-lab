# Microservicio UNDC

Este microservicio expone un endpoint `/prueba` que devuelve información básica de la Universidad Nacional de Cañete, incluyendo su RUC y correo institucional.

---

## 🏛️ Datos de la Institución

- **Nombre:** Universidad Nacional de Cañete  
- **ID (RUC):** 20491363402  
- **Correo:** consultas@undc.edu.pe  

---

## 🐳 Imagen Docker

La imagen ha sido construida utilizando una estrategia multistage, sin usar root, y etiquetada como `3.0`.

- 📦 Imagen DockerHub:  
  [`victorcuaresma/undc-microservicio:3.0`](https://hub.docker.com/r/victorcuaresma/undc-microservicio/tags)

```bash
docker pull victorcuaresma/undc-microservicio:3.0
