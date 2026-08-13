# 📦 mga-all-models-jars

[![Build Tool](https://img.shields.io/badge/Build-Apache%20Maven%203.9.x-C71A36?logo=apachemaven)](https://maven.apache.org/)
[![Java Version](https://img.shields.io/badge/Java-17-007396?logo=openjdk)](https://openjdk.org/)
[![Distribution](https://img.shields.io/badge/JitPack%20%2F%20Maven-mga--all--models--jars-brightgreen)](https://jitpack.io)

## 📌 Project Overview

**`mga-all-models-jars`** is the centralized domain model and contract encapsulation library for the **MGA (My Gym Application)** microservices platform. 

This repository consolidates all core domain entities, Data Transfer Objects (DTOs), request/response models, and wrapper objects (`Member`, `Admin`, `Trainer`, `MemberWrapper`, `Notification`, `BroadcastMessageDto`, etc.) used across all 11 Spring Boot microservices.

### 💡 Architectural Benefits
* **Zero Schema Duplication**: Eliminates redundant entity declarations across business logic, CRUD data access, messaging, and AI layers.
* **Unified Serialization Contracts**: Guarantees identical JSON/Jackson serialization properties across HTTP RestClient exchanges and Kafka event payloads.
* **Centralized Maintenance**: Enables single-point updates for domain contracts across the entire ecosystem.

---

## 🛠️ Technical Specifications
* **Language**: Java 17
* **Build Tool**: Apache Maven `3.9.x`
* **Boilerplate Reduction**: Project Lombok (`@Data`, `@NoArgsConstructor`, `@AllArgsConstructor`, `@Builder`)
* **Serialization**: Jackson Annotations (`@JsonProperty`, `@JsonIgnoreProperties`)

---

## 🚀 How to Include in MGA Services

### Maven Consumers (`pom.xml`)
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>[https://jitpack.io](https://jitpack.io)</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.my-gym-app</groupId>
        <artifactId>mga-all-models-jars</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>
</dependencies>
Gradle Consumers (build.gradle)
Groovy
repositories {
    mavenCentral()
    maven { url '[https://jitpack.io](https://jitpack.io)' }
}

dependencies {
    implementation 'com.github.my-gym-app:mga-all-models-jars:1.0.0-SNAPSHOT'
}
⚙️ Local Build & Installation
Bash
mvn clean compile
mvn clean install
