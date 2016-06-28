package br.com.inf.persistencia.mockStrategies;

import com.github.javafaker.Faker;
import uk.co.jemos.podam.common.AttributeStrategy;

/**
 * Estratégia de geração de datas (somente ano).
 */
public class AnoMockStrategy implements AttributeStrategy<Integer> {

    /**
     * <p>Retorna um ano random.</p>
     * {@inheritDoc}
     */
    @Override
    public Integer getValue() {
        Faker faker = new Faker();
        return faker.number().numberBetween(1980, 2016);
    }
}
