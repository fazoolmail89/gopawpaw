package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FlpPlan entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FlpPlan
 * @author MyEclipse Persistence Tools
 */

public class FlpPlanDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FlpPlanDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FlpPlan transientInstance) {
		log.debug("saving FlpPlan instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FlpPlan persistentInstance) {
		log.debug("deleting FlpPlan instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FlpPlan findById(com.gopawpaw.erp.hibernate.f.FlpPlanId id) {
		log.debug("getting FlpPlan instance with id: " + id);
		try {
			FlpPlan instance = (FlpPlan) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FlpPlan", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FlpPlan instance) {
		log.debug("finding FlpPlan instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding FlpPlan instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FlpPlan as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FlpPlan instances");
		try {
			String queryString = "from FlpPlan";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FlpPlan merge(FlpPlan detachedInstance) {
		log.debug("merging FlpPlan instance");
		try {
			FlpPlan result = (FlpPlan) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FlpPlan instance) {
		log.debug("attaching dirty FlpPlan instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FlpPlan instance) {
		log.debug("attaching clean FlpPlan instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FlpPlanDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FlpPlanDAO) ctx.getBean("FlpPlanDAO");
	}
}